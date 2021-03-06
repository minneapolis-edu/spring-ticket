package com.clara.ticket.repository;

import com.clara.ticket.model.Ticket;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends PagingAndSortingRepository<Ticket, Long> {

    // Get all unresolved tickets, order by priority, 1 (most urgent) first,
    List<Ticket> findTicketByResolvedOrderByPriorityAsc(boolean resolved);

}
