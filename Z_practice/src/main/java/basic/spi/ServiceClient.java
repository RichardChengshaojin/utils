package basic.spi;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/2
 */
public class ServiceClient {

    public static void main(String[] args) throws InterruptedException {
        ISearch searchService = ServiceManager.getService("db");
        if (null != searchService) {
            System.out.println(searchService.name());
            searchService.search("mine");
        }
    }
}
