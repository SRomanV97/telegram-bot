package com.github.javarushcommunity.telegrambot.service;


import com.github.javarushcommunity.telegrambot.bot.JavarushTelegramBot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@DisplayName("Unit-level testing SendBotMessageService")
public class SendBotMessageServiceTest {

    private SendBotMessageService sendBotMessageService;
    private JavarushTelegramBot javarushBot;

    @BeforeEach
    public void init(){
        javarushBot = Mockito.mock(JavarushTelegramBot.class);
        sendBotMessageService = new SendBotMessageServiceImpl(javarushBot);
    }

    @Test
    public void shouldProperlySendMessage() throws TelegramApiException{
        //given - подготавливаем все необходимое к тесту
        String chatId = "test_chat_id";
        String message = "test_message";

        SendMessage sendMessage = new SendMessage();
        sendMessage.setText(message);
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);

        //when - запускаем тот метод который планируем тестить
        sendBotMessageService.sendMessage(chatId, message);

        //then - проверяем, правильно ли отработал метод
        Mockito.verify(javarushBot).execute(sendMessage);
    }
}
