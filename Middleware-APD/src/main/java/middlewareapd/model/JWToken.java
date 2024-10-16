package middlewareapd.model; // Ensure this matches your directory structure

import java.time.LocalDateTime;
import lombok.Data;

/**
 * Represents a JWT (JSON Web Token) with associated metadata.
 *
 * <p>This class encapsulates the details of a JWT, including the token itself, 
 * user-specific UUID, admin status, and timestamps for last login, logout, 
 * and last access. It provides getter and setter methods, along with 
 * {@code equals()}, {@code hashCode()}, and {@code toString()} implementations, 
 * generated by the <a href="https://projectlombok.org/features/Data" target="_blank">Lombok</a>
 */
@Data
public class JWToken {
    private String jwt;               // The JWT string
    private String uuid;              // Unique identifier for the user
    private int isAdmin;             // User's admin status (0 for false, 1 for true)
    private LocalDateTime lastLogin;  // Timestamp of the last login
    private LocalDateTime logout;     // Timestamp of the logout
    private LocalDateTime lastAccess; // Timestamp of the last request using this token

    /**
     * Constructor to initialize a JWToken object with all fields.
     *
     * @param jwt        the JWT string.
     * @param uuid       the unique identifier for the user.
     * @param isAdmin    the user's admin status (0 for false, 1 for true).
     * @param lastLogin  the timestamp of the last login.
     * @param logout     the timestamp of the logout.
     * @param lastAccess the timestamp of the last access.
     */
    public JWToken(String jwt, String uuid, int isAdmin, LocalDateTime lastLogin, LocalDateTime logout, LocalDateTime lastAccess) {
        this.jwt = jwt;
        this.uuid = uuid;
        this.isAdmin = isAdmin;
        this.lastLogin = lastLogin;
        this.logout = logout;
        this.lastAccess = lastAccess;
    }
}
