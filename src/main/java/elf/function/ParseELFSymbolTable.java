package elf.function;

import elf.ELFUtils;
import elf.entity.ELFStringTable;
import elf.entity.Offset;
import elf.entity.symboltable.Symbol;
import elf.entity.symboltable.SymbolTable;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/8 10:38
 * @Description: null
 */
public class ParseELFSymbolTable {
    public SymbolTable getSymbolTable(byte[]bytes) {
        SymbolTable symbolTable = ELFInfoContainer.getElfFile().getSymbolTable();
        Integer symbolOffset = symbolTable.getOffset();
        for (int i = 0; i < symbolTable.getEntryNum(); i++) {
            symbolTable.addSymbol(getSymbol(ELFUtils.copyBytes(bytes,symbolOffset,symbolTable.getEntrySize())));
            symbolOffset+= symbolTable.getEntrySize();
        }
        return symbolTable;
    }
    private Symbol getSymbol(byte[] bytes){
        Offset offset = new Offset(0);
        Symbol symbol = new Symbol();
        ELFStringTable elfStringTable = ELFInfoContainer.getSymbolStringTable();
        symbol.setStName(elfStringTable.getNameByIndex(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4)))));
        symbol.setValue(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4))));
        symbol.setSize(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(4))));
        symbol.setInfo(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(1))));
        symbol.setOthers(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(1))));
        symbol.setShndx(ELFUtils.byteToIntLSB(ELFUtils.copyBytes(bytes,offset.getOffset(),offset.incrementAndReturnDuration(2))));
        return symbol;

    }
}
