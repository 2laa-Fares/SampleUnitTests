package sa.net.apit.sampleunittests;

import java.util.Calendar;

/**
 * Model class containing personal information that will be saved to SharedPreferences.
 */
public class SharedPreferenceEntry {

    // Name of the user.
    private final String mName;

    // Date of Birth of the user.
    private final Calendar mDateOfBirth;

    // Email address of the user.
    private final String mEmail;

    SharedPreferenceEntry(String name, Calendar dateOfBirth, String email) {
        mName = name;
        mDateOfBirth = dateOfBirth;
        mEmail = email;
    }

    public String getName() {
        return mName;
    }

    Calendar getDateOfBirth() {
        return mDateOfBirth;
    }

    String getEmail() {
        return mEmail;
    }
}
