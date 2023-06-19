package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;
import java.util.Date;

@Jacksonized
@AllArgsConstructor
@Data
@Builder
public class QuotationDTO {

    private Date date;

    private BigDecimal currencyPrice;

}
