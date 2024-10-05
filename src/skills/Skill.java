package skills;
import java.util.HashSet;
import java.util.Set;

public class Skill {

    private final Set<String> skills;

    public Skill() { this.skills = new HashSet<>(); }

    // Setters and Getters
    public void setCategory(Category category) {
        switch (category) {
            case CONTROLLER:
                skills.add("Sky Smoke");
                skills.add("Orbital Strike");
                skills.add("Stim Beacon");
                skills.add("Incendiary");
                skills.add("Dark Cover");
                skills.add("Shrouded Step");
                skills.add("Paranoia");
                skills.add("From the Shadows");
                skills.add("Cascade");
                skills.add("Reckoning");
                skills.add("Cove");
                skills.add("High Tide");
                break;

            case INITIATOR:
                skills.add("Recon Bolt");
                skills.add("Hunter's Fury");
                skills.add("Owl Drone");
                skills.add("Shock Bolt");
                skills.add("Fault Line");
                skills.add("Rolling Thunder");
                skills.add("Aftershock");
                skills.add("Flashpoint");
                skills.add("Guiding Light");
                skills.add("Seekers");
                skills.add("Trailblazer");
                skills.add("Regrowth");
                skills.add("Zero/Point");
                skills.add("Null/CMD");
                skills.add("Frag/Ment");
                skills.add("Flash/Drive");
                break;

            case SENTINEL:
                skills.add("Turret");
                skills.add("Lockdown");
                skills.add("Nanoswarm");
                skills.add("Alarmbot");
                skills.add("Spycam");
                skills.add("Neural Theft");
                skills.add("Trapwire");
                skills.add("Cyber Cage");
                skills.add("Healing Orb");
                skills.add("Resurrection");
                skills.add("Barrier Orb");
                skills.add("Slow Orb");
                skills.add("Barrier Mesh");
                skills.add("Annihilation");
                skills.add("Gravnet");
                skills.add("Sonic Sensor");
                break;

            case DUELIST:
                skills.add("Heating Up");
                skills.add("Hot Hands");
                skills.add("Run it Back");
                skills.add("Blaze");
                skills.add("Curveball");
                skills.add("Drift");
                skills.add("Tailwind");
                skills.add("Cloudburst");
                skills.add("Blade Storm");
                skills.add("Updraft");
                skills.add("Soul Harvest");
                skills.add("Devour");
                skills.add("Dismiss");
                skills.add("Empress");
                skills.add("Gatecrash");
                skills.add("Dimensional Drift");
                skills.add("Fakeout");
                skills.add("Blindside");
                break;

            default:
                System.out.println("Not a valid category. Thge input category is: " + category);
                break;

        }
    }

    public Set<String> getSkills() { return skills; }
}
