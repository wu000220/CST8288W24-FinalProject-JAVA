package tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import businesslayer.UserBusinessLogic;
import businesslayer.ValidationException;
import model.User;

/**
 * This class contains unit tests for the UserBusinessLogic class.
 */
public class UserBusinessLogicTest {

    private UserBusinessLogic userBusinessLogic;

    /**
     * Sets up the test environment before each test method is executed.
     */
    @Before
    public void setUp() {
        userBusinessLogic = new UserBusinessLogic();
    }

    /**
     * Tests adding a valid user, expecting no ValidationException to be thrown.
     */
    @Test
    public void testAddUser_ValidUser_DoesNotThrowException() {
        User testUser = new User();
        testUser.setUserName("testUser");
        testUser.setEmail("testEmail@example.com");
        testUser.setPassword("validPassword123");
        testUser.setUserType("testType");
        testUser.setSubscription("testSubscription");
        
        try {
            userBusinessLogic.addUser(testUser);
        } catch (ValidationException e) {
            fail("ValidationException should not be thrown for a valid user: " + e.getMessage());
        }
    }
    
    /**
     * Tests adding a user with a short password, expecting a ValidationException to be thrown.
     */
    @Test
    public void testAddUser_ShortPassword_ThrowsValidationException() {
        User testUser = new User();
        testUser.setUserName("testUser");
        testUser.setEmail("testEmail@example.com");
        testUser.setPassword("short");
        testUser.setUserType("testType");
        testUser.setSubscription("testSubscription");
        
        try {
            userBusinessLogic.addUser(testUser);
            fail("Expected ValidationException to be thrown due to short password");
        } catch (ValidationException e) {
            // Expected exception, test passes
        }
    }

    /**
     * Tests adding a user with a valid user type, expecting no ValidationException to be thrown.
     */
    @Test
    public void testAddUser_ValidUserType_DoesNotThrowException() {
        User testUser = new User();
        testUser.setUserName("testUser");
        testUser.setEmail("testEmail@example.com");
        testUser.setPassword("validPassword123");
        testUser.setUserType("regular"); // Valid user type
        testUser.setSubscription("testSubscription");

        try {
            userBusinessLogic.addUser(testUser);
        } catch (ValidationException e) {
            fail("ValidationException should not be thrown for a valid user: " + e.getMessage());
        }
    }
}
