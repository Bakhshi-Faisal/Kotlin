import chuckNorris.model.ChuckNorrisRetrofit
import retrofit2.http.GET

interface ChuckNorrisQuoteEndpoint {
    @GET("random")
    suspend fun getRandomQuote() : ChuckNorrisRetrofit
}
