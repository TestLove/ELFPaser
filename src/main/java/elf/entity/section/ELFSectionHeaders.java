package elf.entity.section;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author TestLove
 * @version 1.0
 * @date 2022/7/8 10:20
 * @Description: null
 */
public class ELFSectionHeaders {
    List<ELFSectionHeader> headers;

    Map<String, ELFSectionHeader> headerByName;

    public ELFSectionHeaders() {
        headers = new ArrayList<>();
        headerByName = new HashMap<>();
    }

    public void addSectionHeader(ELFSectionHeader header){
        headers.add(header);
        headerByName.put(header.getName(), header);
    };

    public ELFSectionHeader getHeaderByName(String name) {
        return headerByName.get(name);
    }

    public int getOffsetByName(String name) {
        return headerByName.get(name).getOffset();
    }

    public List<ELFSectionHeader> getHeaders() {
        return headers;
    }
}
