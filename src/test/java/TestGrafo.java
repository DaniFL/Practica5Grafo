import dominio.Grafo;

import org.junit.Test;
import java.util.*;
import static junit.framework.TestCase.assertEquals;


public class TestGrafo {

    @Test
    public void shortestPathFindsAPath() {
        System.out.println("\nTest shortestPathFindsAPath");
        System.out.println("----------------------------");
// We build the graph
        Grafo<Integer> g = new Grafo();
        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);
        g.addVertex(4);
        g.addVertex(5);

        g.addEdge(1, 2);
        g.addEdge(1, 5);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        g.addEdge(5, 4);
        g.addEdge(5, 2);

// We build the expected path
        List<Integer> expectedPath = new ArrayList<>();
        expectedPath.add(1);
        expectedPath.add(5);
        expectedPath.add(4);

        List<Integer> expectedPath2 = new ArrayList<>();
        expectedPath2.add(3);

        expectedPath2.add(2);
//We check if the returned path is equal to the expected one.
        assertEquals(expectedPath, g.shortestPath(1, 4));
        assertEquals(expectedPath2, g.shortestPath(3, 2));
        System.out.println("Expected path: " + expectedPath + "\n" + "Returned path: " + g.shortestPath(1, 4));
        System.out.println("Expected path: " + expectedPath2 + "\n" + "Returned path: " + g.shortestPath(3, 2));
        System.out.println("Test shortestPathFindsAPath passed");
    }
}
