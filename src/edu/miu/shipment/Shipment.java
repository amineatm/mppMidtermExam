package edu.miu.shipment;

public sealed interface Shipment permits ExpressShipment,OvernightShipment,StandardShipment {
    String getTrackingDetails();
}
