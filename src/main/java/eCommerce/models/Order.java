package eCommerce.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ishita.chourasia on 03/05/21.
 */

@Data
@AllArgsConstructor
public class Order {

    String orderId;

    HashMap<Item, Integer> itemList;

    String customerId;

}
