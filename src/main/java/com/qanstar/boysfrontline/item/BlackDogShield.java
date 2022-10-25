package com.qanstar.boysfrontline.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageTracker;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlackDogShield extends ShieldItem {
    public static final Logger LOGGER = LoggerFactory.getLogger("boysfrontline");
    BlackDogShield(Item.Settings settings){
        super(settings);
    }
    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {
        if (user instanceof PlayerEntity) {
            PlayerEntity player =  (PlayerEntity) user;
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,1,4));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,1,4));
//            world.addParticle(ParticleTypes.EXPLOSION,player.getX(),player.getY(),player.getZ(),0,5f,0 );
//            double particleR = player.getHeight()/2;
//            world.addParticle(ParticleTypes.DRAGON_BREATH,player.getX()+particleR,player.getY(),player.getZ(),0,0.5f,0 );
//            world.addParticle(ParticleTypes.DRAGON_BREATH,player.getX()-particleR,player.getY(),player.getZ(),0,0.5f,0 );
//            world.addParticle(ParticleTypes.DRAGON_BREATH,player.getX(),player.getY(),player.getZ()+particleR,0,0.5f,0 );
//            world.addParticle(ParticleTypes.DRAGON_BREATH,player.getX(),player.getY(),player.getZ()-particleR,0,0.5f,0 );
//            world.addParticle(ParticleTypes.DRAGON_BREATH,player.getX()+Math.sqrt(particleR),player.getY(),player.getZ()+Math.sqrt(particleR),0,0.5f,0 );
//            world.addParticle(ParticleTypes.DRAGON_BREATH,player.getX()-Math.sqrt(particleR),player.getY(),player.getZ()-Math.sqrt(particleR),0,0.5f,0 );
//            world.addParticle(ParticleTypes.DRAGON_BREATH,player.getX()+Math.sqrt(particleR),player.getY(),player.getZ()-Math.sqrt(particleR),0,0.5f,0 );
//            world.addParticle(ParticleTypes.DRAGON_BREATH,player.getX()-Math.sqrt(particleR),player.getY(),player.getZ()+Math.sqrt(particleR),0,0.5f,0 );

        }
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,1,2));
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE,1,0));
        return false;
    }
}
