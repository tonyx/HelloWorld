package test.com.company;

import com.company.HelloWorld;
import com.company.io.Writer;
import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

/**
 * Created by Tonyx on 17/06/15.
 */

public class MainTest {
    @Test
    public void shouldSayHello()  {
        // arrange
        Writer writer = mock(Writer.class);
        HelloWorld helloWorld= new HelloWorld(writer);

        // act
        InOrder inOrder = inOrder(writer);
        helloWorld.run();

        // assert
        inOrder.verify(writer).write("hello world");

    }
}
