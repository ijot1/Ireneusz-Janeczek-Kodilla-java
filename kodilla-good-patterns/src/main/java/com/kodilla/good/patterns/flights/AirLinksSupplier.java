package com.kodilla.good.patterns.flights;

import java.time.LocalTime;

public class AirLinksSupplier implements AirLinksSupplierProcess {

    @Override
    public AirLinkRequestDTO process(AirLinkRequest airLinkRequest) {

        HomeAirport homeAirport = airLinkRequest.getHomeAirport();
        Service service = airLinkRequest.getService();
        LocalTime time = airLinkRequest.getTime();
        boolean isOrdered = true;

        return new AirLinkRequestDTO(homeAirport, service, time, true);
    }
}
