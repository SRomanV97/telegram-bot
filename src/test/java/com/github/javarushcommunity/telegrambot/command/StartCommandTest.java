package com.github.javarushcommunity.telegrambot.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.javarushcommunity.telegrambot.command.CommandName.START;
import static com.github.javarushcommunity.telegrambot.command.StartCommand.START_MESSAGE;

@DisplayName("unit-level testing dor HelpCommand")
public class StartCommandTest extends AbstractCommandTest{

    @Override
    String getCommandName(){
        return START.getCommandName();
    }

    @Override
    String getCommandMessage(){
        return START_MESSAGE;
    }

    @Override
    Command getCommand(){
        return new StartCommand(sendBotMessageService);
    }
}
