/*
 * LiquidBounce++ Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/PlusPlusMC/LiquidBouncePlusPlus/
 */
package net.ccbluex.liquidbounce.features.module.modules.movement.speeds.other;

import net.ccbluex.liquidbounce.event.MoveEvent;
import net.ccbluex.liquidbounce.features.module.modules.movement.speeds.SpeedMode;
import net.ccbluex.liquidbounce.utils.MovementUtils;

public class mineland extends SpeedMode {
    public mineland() {
        super("mineland");
    }
    @Override
    public  void onDisable() {
        mc.timer.timerSpeed = 1F;
    }
    @Override
    public void onMotion() {
        if (mc.thePlayer.onGround && MovementUtils.isMoving()) {
            mc.thePlayer.jump();
            mc.timer.timerSpeed = 1F;
        }
        else {
            mc.timer.timerSpeed = 1.5;
        }
    }
    @Override
    public void onUpdate() {
    }
    @Override
    public void onMove(MoveEvent event) {
    }
}
