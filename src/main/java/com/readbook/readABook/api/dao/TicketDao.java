package com.readbook.readABook.api.dao;

import com.readbook.readABook.api.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}