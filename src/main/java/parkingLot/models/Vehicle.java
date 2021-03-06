package parkingLot.models;

import parkingLot.constants.Passengers;
import parkingLot.constants.Vehicles;
import lombok.Builder;
import lombok.Data;

/**
 * Created by ishita.chourasia on 07/03/21.
 */

@Data
@Builder
public class Vehicle {

    int vehicleId;

    Vehicles vehicleType;

    String vehicleNumber;

    Passengers passengerType;
}
