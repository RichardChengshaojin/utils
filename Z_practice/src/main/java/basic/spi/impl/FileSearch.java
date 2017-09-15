package basic.spi.impl;

import basic.spi.ISearch;

import java.util.List;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/1
 */
public class FileSearch implements ISearch {

    // static initialize
    static {
        System.out.println("FileSearch static loading...");
    }

    @Override
    public String name() {
        return "file";
    }

    @Override
    public List<String> search(String keyword) {
        System.out.println(String.format("文件搜索<%s>中...", keyword));
        return null;
    }
}
