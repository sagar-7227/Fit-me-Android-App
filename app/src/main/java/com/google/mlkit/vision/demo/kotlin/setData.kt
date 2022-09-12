package com.google.mlkit.vision.demo.kotlin

object setData {
    fun SetPlanets():List<PlanetData>{
        var Planetlist= mutableListOf<PlanetData>()
        Planetlist.add(
            PlanetData(
                1,
                "Prone T",
                "Shoulder Exercise",
                "The prone T is a shoulder exercise that improves stability. Lie belly down on a bench with your head, neck, and spine aligned. Let your arms hang loose in front of you before raising them to form a T. You can make this exercise more challenging by throwing some small weights into the mix."
            )
        )
        Planetlist.add(
            PlanetData(
                2,
                "Dumbbell Shoulder Push",
                "Shoulder Exercise",
                "Dumbbell shoulder push presses engage your deltoids and trapezius. This exercise also works your glutes, quads, and core. It’s a simple move to learn, which is why we definitely recommend it if you’re new to weight training."
            )
        )
        Planetlist.add(
            PlanetData(
                3,
                "Cable Face Pulls",
                "Shoulder Exercise",
                "Cable face pulls target your lateral and posterior deltoids, teres minors, trapezius, and more.Start by standing in front of a cable machine, cable in hand at shoulder height. Bring your elbows to a slight bend pull it towards your face in an upward motion."
            )
        )
        Planetlist.add(
            PlanetData(
                4,
                "Straight Arm Circles",
                "Shoulder Exercise",
                "Stand up straight and extend your arms to form a T shape. Form circles with your arms and widen these circles as time goes on until you achieve a full range of motion. Change direction after a few seconds. Straight arm circles are also great for improving mobility."
            )
        )
        Planetlist.add(
            PlanetData(
                5,
                "Crab Walk",
                "Shoulder Exercise",
                "The crab walk is a bodyweight exercise that targets your shoulder, core, arm, and leg muscles. The starting position is a seated one. Bridge your hips off the ground, bend your knees, and support yourself using your hands. The purpose of this exercise is to crawl by moving one hand along with the opposite foot and repeating on the other side."
            )
        )
//        data ends

        return Planetlist
    }
}