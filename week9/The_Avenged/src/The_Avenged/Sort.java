package The_Avenged;

import java.util.*;

class Sort implements Comparator<SuperHero>
{
	public int compare(SuperHero a, SuperHero b)
    {
        return a.powerLevel - b.powerLevel;
    }
}
