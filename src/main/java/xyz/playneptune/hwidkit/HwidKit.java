package xyz.playneptune.hwidkit;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;

public class HwidKit {

    /**
     * Generates a unique identifier string based on the specs passed in
     * and hashes it with the MD5 algorithm.
     * @param specsToInclude The specs to include in the identifier.
     * @return The hashed generated identifier.
     */
    public String generateIdentifier(SystemSpecification... specsToInclude) {
        String rawIdentifier = generateRawIdentifier(specsToInclude);
        String hashedIdentifier = getMd5HashOfString(rawIdentifier);
        return hashedIdentifier;
    }

    /**
     * Generates a unique identifier string based on the specs passed in.
     * This method does not hash the generated string.
     * @param specsToInclude The specs to include in the identifier.
     * @return The unhashed generated identifier.
     */
    private String generateRawIdentifier(SystemSpecification... specsToInclude) {
        StringBuilder rawHwidStringBuilder = new StringBuilder();
        Arrays.stream(specsToInclude)
                        .map(SystemSpecification::toString)
                        .forEach(rawHwidStringBuilder::append);
        return rawHwidStringBuilder.toString();
    }

    /**
     * Generates a hash of the given string using the MD5 algorithm.
     * @param toGetHashOf The string to get the hash of.
     * @return The hash of the given string.
     */
    public String getMd5HashOfString(String toGetHashOf) {
        try {
            MessageDigest md5MessageDigest = MessageDigest.getInstance("MD5");
            md5MessageDigest.update(toGetHashOf.getBytes(StandardCharsets.US_ASCII));

            byte[] md5HashBytes = md5MessageDigest.digest();
            BigInteger stolenFromStackOverflow = new BigInteger(1, md5HashBytes);
            String md5HashString = String.format("%032x", stolenFromStackOverflow);
    
            return md5HashString;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

}
