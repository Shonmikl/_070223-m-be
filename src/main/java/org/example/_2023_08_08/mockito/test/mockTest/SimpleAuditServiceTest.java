package org.example._2023_08_08.mockito.test.mockTest;//package javaProf.unit.mockito.test.mockTest;

import org.example._2023_08_08.mockito.mock.*;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SimpleAuditServiceTest {

	@Mock  // actually, this is a stub
	TradeRepository tradeRepository;

	@Mock
	Trade trade;

	@Mock  // and this one is indeed a mock
	AuditService auditService;

	@Test
	public void testAuditLogEntryMadeForNewTrade() throws Exception {
		when(tradeRepository.createTrade(trade)).thenReturn(anyLong());

		TradingService tradingService = new SimpleTradingService(tradeRepository, auditService);
		tradingService.createTrade(trade);

		verify(auditService).logNewTrade(trade);
	}
}