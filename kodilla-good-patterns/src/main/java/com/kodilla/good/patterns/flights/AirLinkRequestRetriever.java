package com.kodilla.good.patterns.flights;

import java.time.LocalTime;
import java.util.ArrayList;

public class AirLinkRequestRetriever {
    public AirLinkRequest retrieve() {

        HomeAirport GdanskRebiechowo = new HomeAirport("GdanskRebiechowo");
        HomeAirport KrakowBalice = new HomeAirport("KrakowBalice");
        HomeAirport PoznanLawica = new HomeAirport("PoznanLawica");
//
        Departure gdaDep1 = new Departure(GdanskRebiechowo, "KrakowBalice", LocalTime.of(5, 15));
        Departure gdaDep2 = new Departure(GdanskRebiechowo, "KrakowBalice", LocalTime.of(12, 15));
        Departure gdaDep3 = new Departure(GdanskRebiechowo, "KrakowBalice", LocalTime.of(16, 15));
        Departure gdaDep4 = new Departure(GdanskRebiechowo, "KrakowBalice", LocalTime.of(20, 15));

        Departure kraDep1 = new Departure(KrakowBalice, "Gdansk", LocalTime.of(7, 15));
        Departure kraDep2 = new Departure(KrakowBalice, "Gdansk", LocalTime.of(10, 15));
        Departure kraDep3 = new Departure(KrakowBalice, "Gdansk", LocalTime.of(13, 15));
        Departure kraDep4 = new Departure(KrakowBalice, "Gdansk", LocalTime.of(18, 15));

        Departure kraDep5 = new Departure(KrakowBalice, "PoznanLawica", LocalTime.of(6, 15));
        Departure kraDep6 = new Departure(KrakowBalice, "PoznanLawica", LocalTime.of(11, 15));
        Departure kraDep7 = new Departure(KrakowBalice, "PoznanLawica", LocalTime.of(14, 15));
        Departure kraDep8 = new Departure(KrakowBalice, "PoznanLawica", LocalTime.of(19, 15));

        Departure pozDep1 = new Departure(PoznanLawica, "KrakowBalice", LocalTime.of(5, 15));
        Departure pozDep2 = new Departure(PoznanLawica, "KrakowBalice", LocalTime.of(7, 30));
        Departure pozDep3 = new Departure(PoznanLawica, "KrakowBalice", LocalTime.of(10, 15));
        Departure pozDep4 = new Departure(PoznanLawica, "KrakowBalice", LocalTime.of(14, 15));

        Departure pozDep5 = new Departure(PoznanLawica, "Gdansk", LocalTime.of(6, 15));
        Departure pozDep6 = new Departure(PoznanLawica, "Gdansk", LocalTime.of(8, 15));
        Departure pozDep7 = new Departure(PoznanLawica, "Gdansk", LocalTime.of(11, 15));
        Departure pozDep8 = new Departure(PoznanLawica, "Gdansk", LocalTime.of(18, 15));

        Departure gdaDep5 = new Departure(GdanskRebiechowo, "PoznanLawica", LocalTime.of(8, 15));
        Departure gdaDep6 = new Departure(GdanskRebiechowo, "PoznanLawica", LocalTime.of(12, 15));
        Departure gdaDep7 = new Departure(GdanskRebiechowo, "PoznanLawica", LocalTime.of(16, 15));
        Departure gdaDep8 = new Departure(GdanskRebiechowo, "PoznanLawica", LocalTime.of(20, 15));
//
        Arrival gdaArr1 = new Arrival(GdanskRebiechowo, "KrakowBalice", LocalTime.of(10, 15));
        Arrival gdaArr2 = new Arrival(GdanskRebiechowo, "KrakowBalice", LocalTime.of(13, 15));
        Arrival gdaArr3 = new Arrival(GdanskRebiechowo, "KrakowBalice", LocalTime.of(16, 15));
        Arrival gdaArr4 = new Arrival(GdanskRebiechowo, "KrakowBalice", LocalTime.of(21, 15));

        Arrival kraArr1 = new Arrival(KrakowBalice, "Gdansk", LocalTime.of(8, 20));
        Arrival kraArr2 = new Arrival(KrakowBalice, "Gdansk", LocalTime.of(11, 10));
        Arrival kraArr3 = new Arrival(KrakowBalice, "Gdansk", LocalTime.of(15, 10));
        Arrival kraArr4 = new Arrival(KrakowBalice, "Gdansk", LocalTime.of(23, 10));

        Arrival kraArr5 = new Arrival(KrakowBalice, "PoznanLawica", LocalTime.of(7, 40));
        Arrival kraArr6 = new Arrival(KrakowBalice, "PoznanLawica", LocalTime.of(9, 10));
        Arrival kraArr7 = new Arrival(KrakowBalice, "PoznanLawica", LocalTime.of(12, 15));
        Arrival kraArr8 = new Arrival(KrakowBalice, "PoznanLawica", LocalTime.of(16, 30));

        Arrival pozArr1 = new Arrival(PoznanLawica, "KrakowBalice", LocalTime.of(8, 30));
        Arrival pozArr2 = new Arrival(PoznanLawica, "KrakowBalice", LocalTime.of(12, 20));
        Arrival pozArr3 = new Arrival(PoznanLawica, "KrakowBalice", LocalTime.of(16, 0));
        Arrival pozArr4 = new Arrival(PoznanLawica, "KrakowBalice", LocalTime.of(21, 30));

        Arrival pozArr5 = new Arrival(PoznanLawica, "Gdansk", LocalTime.of(7, 15));
        Arrival pozArr6 = new Arrival(PoznanLawica, "Gdansk", LocalTime.of(9, 20));
        Arrival pozArr7 = new Arrival(PoznanLawica, "Gdansk", LocalTime.of(11, 0));
        Arrival pozArr8 = new Arrival(PoznanLawica, "Gdansk", LocalTime.of(8, 15));

        Arrival gdaArr5 = new Arrival(GdanskRebiechowo, "PoznanLawica", LocalTime.of(10, 15));
        Arrival gdaArr6 = new Arrival(GdanskRebiechowo, "PoznanLawica", LocalTime.of(14, 15));
        Arrival gdaArr7 = new Arrival(GdanskRebiechowo, "PoznanLawica", LocalTime.of(19, 15));
        Arrival gdaArr8 = new Arrival(GdanskRebiechowo, "PoznanLawica", LocalTime.of(22, 15));

        ArrayList<Departure> gdaD = new ArrayList<Departure>();
        ArrayList<Departure> kraD = new ArrayList<Departure>();
        ArrayList<Departure> pozD = new ArrayList<Departure>();

        TimetableDepartures gdaDepartures = new TimetableDepartures(gdaD);
        TimetableDepartures kraDepartures = new TimetableDepartures(kraD);
        TimetableDepartures pozDepartures = new TimetableDepartures(pozD);

        gdaDepartures.addDeparture(gdaDep1);
        gdaDepartures.addDeparture(gdaDep2);
        gdaDepartures.addDeparture(gdaDep3);
        gdaDepartures.addDeparture(gdaDep4);
        gdaDepartures.addDeparture(gdaDep5);
        gdaDepartures.addDeparture(gdaDep6);
        gdaDepartures.addDeparture(gdaDep7);
        gdaDepartures.addDeparture(gdaDep8);

        kraDepartures.addDeparture(kraDep1);
        kraDepartures.addDeparture(kraDep2);
        kraDepartures.addDeparture(kraDep3);
        kraDepartures.addDeparture(kraDep4);
        kraDepartures.addDeparture(kraDep5);
        kraDepartures.addDeparture(kraDep6);
        kraDepartures.addDeparture(kraDep7);
        kraDepartures.addDeparture(kraDep8);

        pozDepartures.addDeparture(pozDep1);
        pozDepartures.addDeparture(pozDep2);
        pozDepartures.addDeparture(pozDep3);
        pozDepartures.addDeparture(pozDep4);
        pozDepartures.addDeparture(pozDep5);
        pozDepartures.addDeparture(pozDep6);
        pozDepartures.addDeparture(pozDep7);
        pozDepartures.addDeparture(pozDep8);

        ArrayList<Arrival> gdaA = new ArrayList<Arrival>();
        ArrayList<Arrival> kraA = new ArrayList<Arrival>();
        ArrayList<Arrival> pozA = new ArrayList<Arrival>();

        TimetableArrivals gdaArrivals = new TimetableArrivals(gdaA);
        TimetableArrivals kraArrivals = new TimetableArrivals(kraA);
        TimetableArrivals pozArrivals = new TimetableArrivals(pozA);

        gdaArrivals.addArrival(gdaArr1);
        gdaArrivals.addArrival(gdaArr2);
        gdaArrivals.addArrival(gdaArr3);
        gdaArrivals.addArrival(gdaArr4);
        gdaArrivals.addArrival(gdaArr5);
        gdaArrivals.addArrival(gdaArr6);
        gdaArrivals.addArrival(gdaArr7);
        gdaArrivals.addArrival(gdaArr8);

        kraArrivals.addArrival(kraArr1);
        kraArrivals.addArrival(kraArr2);
        kraArrivals.addArrival(kraArr3);
        kraArrivals.addArrival(kraArr4);
        kraArrivals.addArrival(kraArr5);
        kraArrivals.addArrival(kraArr6);
        kraArrivals.addArrival(kraArr7);
        kraArrivals.addArrival(kraArr8);

        pozArrivals.addArrival(pozArr1);
        pozArrivals.addArrival(pozArr2);
        pozArrivals.addArrival(pozArr3);
        pozArrivals.addArrival(pozArr4);
        pozArrivals.addArrival(pozArr5);
        pozArrivals.addArrival(pozArr6);
        pozArrivals.addArrival(pozArr7);
        pozArrivals.addArrival(pozArr8);

        Airport Gdansk = new Airport(GdanskRebiechowo, gdaDepartures, gdaArrivals);
        Airport Krakow = new Airport(KrakowBalice, gdaDepartures, gdaArrivals);
        Airport Poznan = new Airport(PoznanLawica, gdaDepartures, gdaArrivals);

        AirLinksSupplier airLinksSupplier = new AirLinksSupplier();
        Service service = new Service(new CustomersServices(0).getCustomerService());
        LocalTime time = LocalTime.of(10, 0);

        return new AirLinkRequest(GdanskRebiechowo, service, time);
    }

}
