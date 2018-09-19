import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HelloWorldTest
{
    @Test
    public void testGreetingFr() {
        assertThat (HelloWorld.greeting(HelloWorld.Language.FR),
                equalTo ("Bonjour le monde !"));

    }

    @Test
    public void testGreetingEn() {
        assertThat (HelloWorld.greeting(HelloWorld.Language.EN),
                equalTo ("Hello World!"));

    }


}
