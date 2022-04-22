package com.github.javarushcommunity.telegrambot.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.javarushcommunity.telegrambot.command.UnknownCommand.UNKNOWN_MESSAGE;

@DisplayName("unit-level testing dor HelpCommand")
public class UnknownCommandTest extends AbstractCommandTest{

    @Override
    String getCommandName(){
        return "/asdqwe";
    }

    @Override
    String getCommandMessage(){
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand(){
        return new UnknownCommand(sendBotMessageService);
    }
}
