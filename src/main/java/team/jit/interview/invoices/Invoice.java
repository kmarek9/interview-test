package team.jit.interview.invoices;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    private LocalDate date;

    private String number;

    //TODO tu dodać pozycje faktury - InvoiceDetail
}
