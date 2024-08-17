package org.example.javatest.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);

}
