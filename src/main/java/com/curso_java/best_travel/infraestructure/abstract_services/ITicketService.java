package com.curso_java.best_travel.infraestructure.abstract_services;

import com.curso_java.best_travel.api.models.request.TicketRequest;
import com.curso_java.best_travel.api.models.responses.TicketResponse;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

public interface ITicketService extends CrudService<TicketRequest, TicketResponse, UUID> {

    BigDecimal findPrice(Long flyId, Currency currency);

}
