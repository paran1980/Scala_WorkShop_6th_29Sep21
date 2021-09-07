//Create case class Song with title, artist and track attributes
//  Create case class object
//  Get title from the object
//  try to mutate the title value
//  Compare 2 case classes

//Create new object using shallow copy

case class Song(title:String,artist:String,track:String)

val song1 = Song(title="title#1", artist="artist#1",track="track1")
val song2 = Song(title="title#2", artist="artist#2",track="track2")
val song1Copy= song1.copy()

song1.title
//song1.title="title#3" // error reassignment to val
song1.hashCode()
song2.hashCode()
song1 eq song2
song1 == song2
song1 equals song2

song1Copy.hashCode()
song1.hashCode()
song1Copy eq song1
song1Copy == song1
song1Copy equals song1