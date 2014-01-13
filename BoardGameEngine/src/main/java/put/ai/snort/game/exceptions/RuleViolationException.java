/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package put.ai.snort.game.exceptions;

import put.ai.snort.game.Player;
import put.ai.snort.game.Player.Color;

public class RuleViolationException extends Exception {

    private Player.Color guilty;

    public RuleViolationException(Player.Color guilty, String message) {
        super(guilty + ": " + message);
        this.guilty = guilty;
    }

    public RuleViolationException(Player.Color guilty, Exception reason) {
        this(guilty, reason.toString());
    }

    public Color getGuilty() {
        return guilty;
    }
}
