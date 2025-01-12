package Regex.ip;

/**
This pattern checks if the input is a valid IPv4 address with the following characteristics:

It must have exactly four octets separated by dots (.).
Each octet is a number between 0 and 255.

Regex Breakdown
    1. Anchors
        ^: Ensures the match starts at the beginning of the string.
        $: Ensures the match ends at the end of the string.
    These ensure that the entire string matches the pattern.

    2. Repetition {3}
        ((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.){3}:
    Matches the first three octets, each followed by a dot (.).
    {3} ensures that this part repeats exactly three times.

    3. Matching the Fourth Octet
        (25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9]):
    Matches the fourth octet without a trailing dot.

    4. Octet Validation
    Each octet must be a number between 0 and 255. The sub-pattern for an octet is:

    a. 25[0-5]:
    Matches numbers 250 to 255.

    b. 2[0-4][0-9]:
    Matches numbers 200 to 249.
    [0-4]: Restricts the second digit to 0-4.
    [0-9]: Restricts the third digit to 0-9.

    c. [01]?[0-9]?[0-9]:
    Matches numbers 0 to 199 with optional leading zeros.
    [01]?: Matches an optional leading 0 or 1.
    [0-9]?: Matches an optional second digit.
    [0-9]: Matches the final mandatory digit.

    5. Literal Dots (\\.)
    \\.: Matches a literal dot (.).

    Ensures each octet (except the last) is followed by a dot.


 */

class MyRegex {
    String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.){3}" + "(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])$";
}