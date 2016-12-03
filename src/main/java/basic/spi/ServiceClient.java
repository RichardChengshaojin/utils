package basic.spi;

import java.util.List;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/2
 */
public class ServiceClient {

    public static void main(String[] args) {
        List<ISearch> services = ServiceManager.getServiceList();
        for (ISearch searchService : services) {
            searchService.search(null);
        }

        ISearch searchService = ServiceManager.getService("db");
        if (null != searchService) {
            System.out.println(searchService.name());
            searchService.search("mine");
        }
    }
}
