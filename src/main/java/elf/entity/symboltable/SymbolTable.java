package elf.entity.symboltable;

import elf.entity.section.ELFSectionHeader;
import elf.function.ELFInfoContainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/8 10:41
 * @Description: null
 */
public class SymbolTable {
    List<Symbol> symbols;

    Map<String, Symbol> symbolByName;

    int entrySize;

    int entryNum;

    int offset;

    public SymbolTable() {
        symbols = new ArrayList<>();
        symbolByName = new HashMap<>();
        ELFSectionHeader sectionHeaderByName = ELFInfoContainer.getSectionHeaderByName(".symtab");
        entrySize = sectionHeaderByName.getEntsize();
        entryNum = sectionHeaderByName.getSize()/entrySize;
        offset = sectionHeaderByName.getOffset();
    }

    public int getEntrySize() {
        return entrySize;
    }

    public int getEntryNum() {
        return entryNum;
    }

    public int getOffset() {
        return offset;
    }

    public void addSymbol(Symbol symbol){
        symbols.add(symbol);
        symbolByName.put(symbol.getStName(), symbol);
    };

    public Symbol getSymbolByName(String name) {
        return symbolByName.get(name);
    }
    public List<Symbol> getSymbols() {
        return symbols;
    }
}
