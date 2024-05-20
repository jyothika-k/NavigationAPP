package Data.model

val places= listOf(
    Place(0,"Recoup Health Jayanagar","Frustrated by healthcare that only treats symptoms and not the real issue, a leading pain & lifestyle physician and a tech entrepreneur – who also happen to be brothers – decided to give healthcare a fundamental overhaul. They leveraged cutting-edge technology and decades of clinical expertise to build a unique care model that is holistic, personalized, and treats the root cause, so you get healthy from within.",12.925007,77.593803
    ),
    Place(1,"SPARSH Hospital, Infantry Road","New opportunities, challenges, and the drive to help more people are what push us to be the best at SPARSH. Ever since our inception, we have had one goal: to make quality healthcare accessible to the poorer. At SPARSH, we stand for achieving clinical excellence with social relevance. Making a difference and positive impact on society at a larger scale has always been vital to us and keeping this in mind, our story began — a journey with no end.",12.9833,12.9833
    ),
    Place(2,"St. Martha's Hospital","St. Martha’s Hospital, Bengaluru was founded in 1886 by the Congregation of Our Lady of Charity of the Good Shepherd (also known as the Sisters of the Good Shepherd) in response to the urgent need for medical aid to those affected by the epidemic of plague & famine.",12.9711,77.5865)
)

class Placerepository {
    fun getPlaces():List<Place>{
        return places
    }

    fun getplace(placeid:Int):Place?{
        return places.find { it.id==placeid }
    }

}