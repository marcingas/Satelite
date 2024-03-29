public class TestFly {
    public static void main(String[] args) {
        inFlight(new Jet());
       orbit(new Satellite());
       orbit(new Satellite());
       inFlight(new Jet());

    }





    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }
    private static void orbit(OrbitEarth flier){
        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
