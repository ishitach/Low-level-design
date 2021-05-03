package parkingLot.processor.impl;

import parkingLot.models.Ticket;
import parkingLot.models.Vehicle;
import parkingLot.processor.RequestProcessor;
import parkingLot.service.impl.FloorImpl;

/**
 * Created by ishita.chourasia on 07/03/21.
 */
public class RequestProcessorImpl implements RequestProcessor {

    FloorImpl floor;

    private static RequestProcessorImpl requestProcessor;

    public void createParkingSystem(int floors){
        floor = new FloorImpl();
        floor.createSystem(floors);
        return;
    }

    public synchronized Object parkingRequest(int input, Object object) {

        switch (input){

            case 0 :
                 return floor.addVehicle((Vehicle) object);

            case 1 :
                return floor.removeVehicle((Ticket)object);

            default: break;
        }

        return null;
    }

}
