package basic.spi.impl;

import basic.spi.ISearch;

import java.util.List;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/2
 */
public class DBSearch implements ISearch {

    // static initialize
    static {
        System.out.println("DBSearch static loading...");
    }

    @Override
    public String name() {
        return "db";
    }

    @Override
    public List<String> search(String keyword) {
        System.out.println(String.format("数据库搜索<%s>中...", keyword));
        return null;
    }
}
