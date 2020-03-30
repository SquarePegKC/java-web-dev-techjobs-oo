package org.launchcode.techjobs_oo.Tests;

import org.launchcode.techjobs_oo.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
        private Job jobOne;
        private Job jobTwo;
        private Job testJob;
        private Job testJobCopy;
        private Job emptyFieldTestJob;


@BeforeClass
    public void createJobObjects() {
            jobOne = new Job();
            jobTwo = new Job();
            testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            testJobCopy = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
            emptyFieldTestJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

@Test
    public void testSettingJobId() {
        assertEquals (1, jobOne.getId());
        assertEquals (2, jobTwo.getId());
        assertEquals (3, testJob.getId());
        assertEquals (4, testJobCopy.getId());
        assertEquals (5, emptyFieldTestJob.getId());
    }
@Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJob.getName() instanceof String);
        assertEquals("Product Tester", testJob.getName());
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertTrue(testJob.getLocation() instanceof Location);
        assertEquals("Desert", testJob.getLocation().getValue());
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertEquals("Quality Control", testJob.getPositionType().getValue());
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }
@Test
    public void testJobForEquality() {
        assertFalse(testJob.equals(testJobCopy));
    }
@Test
    public void testToString() {
        assertEquals(jobOne.toString().startsWith("\n"));
        assertEquals(jobOne.toString().endsWith("\n"));
    }
@Test
    public void testToStringField() {

    assertEquals(jobOne.startsWith("\n").endsWith("\n"));
    }

};


