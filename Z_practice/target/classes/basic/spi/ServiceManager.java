package basic.spi;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/2
 */
public class ServiceManager {

    private final static List<ISearch> services = new ArrayList<>();

    static {
        ServiceLoader<ISearch> _services = ServiceLoader.load(ISearch.class);
        for(ISearch searchService : _services) {
            services.add(searchService);
        }
    }

    @Deprecated
    public static List<ISearch> getServiceList() {
        return services;
    }

    public static ISearch getService(String name) {
        for (ISearch searchService : services) {
            if(name.equalsIgnoreCase(searchService.name())) {
                return searchService;
            }
        }
        return null;
    }
}
