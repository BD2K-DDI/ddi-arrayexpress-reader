package uk.ac.ebi.ddi.arrayexpress.reader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.URL;

import static org.junit.Assert.*;

/**
 * @author Yasset Perez-Riverol (ypriverol@gmail.com)
 * @date 29/04/2016
 */
public class ExperimentReaderTest {

    URL url = ExperimentReaderTest.class.getClassLoader().getResource("example.xml");

    File file = null;

    @Before
    public void setUp() throws Exception {
        file = new File(url.toURI());
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetExperiments() throws Exception {

        ExperimentReader experimentReader = new ExperimentReader(file);
        System.out.println(experimentReader.getExperiments().getExperiment());

    }
}