package ac.knu.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandParsingServiceTest {

    @Test
    public void botUnderstandsListCommandTest(){
        CommandParsingService commandParsingService = new CommandParsingService();
        String command = commandParsingService.parseCommand("list");
//        assertNotNull(command);
        assertTrue(command.equalsIgnoreCase("time,add"));
    }
}
