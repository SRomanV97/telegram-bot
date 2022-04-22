package com.github.javarushcommunity.telegrambot.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.javarushcommunity.telegrambot.command.CommandName.HELP;
import static com.github.javarushcommunity.telegrambot.command.HelpCommand.HELP_MESSAGE;

@DisplayName("unit-level testing dor HelpCommand")
public class HelpCommandTest extends AbstractCommandTest{

    @Override
    String getCommandName(){
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage(){
        return HELP_MESSAGE;
    }

    @Override
    Command getCommand(){
        return new HelpCommand(sendBotMessageService);
    }


}
