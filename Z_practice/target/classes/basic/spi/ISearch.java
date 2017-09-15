package basic.spi;

import java.util.List;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/11/30
 */
public interface ISearch {
    String name();
    List<String> search(String keyword);
}
