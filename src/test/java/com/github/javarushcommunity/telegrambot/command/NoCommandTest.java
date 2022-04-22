package com.github.javarushcommunity.telegrambot.command;

import org.junit.jupiter.api.DisplayName;


import static com.github.javarushcommunity.telegrambot.command.CommandName.NO;
import static com.github.javarushcommunity.telegrambot.command.NoCommand.NO_MESSAGE;

@DisplayName("unit-level testing dor HelpCommand")
public class NoCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }

}
