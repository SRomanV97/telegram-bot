package com.github.javarushcommunity.telegrambot.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.javarushcommunity.telegrambot.command.CommandName.STOP;
import static com.github.javarushcommunity.telegrambot.command.StopCommand.STOP_MESSAGE;

@DisplayName("unit-level testing dor HelpCommand")
public class StopCommandTest extends AbstractCommandTest{

    @Override
    String getCommandName(){
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage(){
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand(){
        return new StopCommand(sendBotMessageService);
    }
}
