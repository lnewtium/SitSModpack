crafting.remove("atum:shrub_weed_to_stick")
crafting.shapelessBuilder()
    .name("plant_fiber_craft")
	.output(item("pyrotech:material", 12))
	.input(item('atum:weed'))
	.input(item('atum:weed'))
	.input(item('atum:weed'))
	.register()