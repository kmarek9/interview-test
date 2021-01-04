package team.jit.interview.invoices;

import lombok.Value;

import java.time.LocalDate;

@Value
public class FindInvoiceRequest {
    LocalDate date;
    String number;
}
