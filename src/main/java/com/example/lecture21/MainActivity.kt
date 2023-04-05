package com.example.lecture21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var currentImage = 0
    lateinit var image : ImageView

    var names = arrayOf("VIRAT KOHLI", "ROHIT SHARMA", "SONAM BAJWA", "NARENDRA MODI", "SAUMYA SINGH", "DR. A.P.J.ABDUL KALAM")
    var about = arrayOf("India has given to the world many a great cricketer but perhaps none as ambitious as Virat Kohli. To meet his ambition, Kohli employed the technical assiduousness of Sachin Tendulkar and fitness that was in the league of top athletes in the world, not just cricketers. As a result, Kohli became the most consistent all-format accumulator of his time, making jaw-dropping chases look easy, and finding, in his own words, the safest possible way to score runs. Plenty of them.\n" +
            "\n" +
            "This ambition transferred seamlessly to his captaincy: he demanded more than ever of his bowlers especially the quick ones, often sacrificed a batsman for bowling depth, and led India to a long stay at No. 1 in Test rankings and a first-ever series win in Australia. He is well on his way to end up as India's most successful Test captain.\n" +
            "\n" +
            "Barring one in Bangladesh, Kohli scored Test hundreds in and against every country he played. He absolutely smashed records for number of matches taken to reach eight, nine, ten and eleven thousand ODI runs. He was a genuine threat to Sachin Tendulkar's record of 49 ODI and 51 Test hundreds.\n" +
            "\n" +
            "An Under-19 world Cup-winning captain, when he burst onto the scene, Kohli was a precocious talent with a cover drive to kill for. He was destined to be India's next big batsman as the Tendulkar era began to retire, but Kohli wanted to be more: a cricketer whom the opposition would be in awe of, a cricketer whose presence would raise the intensity of the contest. He lived every ball, competed each moment, and made sure he had the fitness and strength to do so. He was widely credited for changing the fitness culture in Indian cricket, introducing endurance tests as a criterion for selection.\n" +
            "\n" +
            "Kohli was quite simply India's most powerful captain. Centre of every marketing campaign for Indian cricket, he also happened to lead at a time when the BCCI was run by interim administrators who knew better than to draw the ire of Indian cricket's biggest star. There was never any cause to doubt his intent: to do things that will win matches for India, which they did plenty under him.","Languid and easy on the eye, Rohit Sharma owned all the shots in the book when he emerged from the Mumbai suburbs as heir apparent to the Indian batting greats of the 2000s. It took him time and persistence, but by the 2010s he had become a colossus in white-ball cricket, and the man in charge of perhaps the most formidable league team in the first age of T20.\n" +
            "\n" +
            "That Rohit had talent was apparent to both the casual observer and to the trained eye. Fans were frustrated at the long wait for the potential to translate into runs, though selectors and captains, knowing better, kept backing him. At one point the word \"talent\" was Rohit's bugbear, a pejorative nickname for him on social media. Once it all clicked, though - the move to open the batting in ODIs late in 2012 was one particular turning point - things came together spectacularly.\n" +
            "\n" +
            "Rohit scored ODI double-hundreds for fun, won six IPLs in the first 15 editions of the tournament, scored five hundreds at the 2019 ODI World Cup, and when he finally got to open in Tests in 2019, three quick hundreds in his first series in the role, one of them a double.\n" +
            "\n" +
            "Ironically his IPL franchise nicknamed him \"Hitman\" when he was anything but: more caresser, less hitter. But Rohit still became known as one of the foremost hitters of colossal sixes of his era. So spectacular and certain was his acceleration that people began anticipate a massive score every time he went past 50.\n" +
            "\n" +
            "His captaincy at Mumbai Indians, whom he led to five titles, won plaudits. He proved himself a methodical, studious and calm leader, one not averse to using technology and data to arrive at decisions. He was an able deputy to Virat Kohli in limited-overs formats in international cricket, winning India two titles in Kohli's absence, and took over as captain in all formats in 2022.","Sonampreet Bajwa (born 16 August 1989) is an Indian model and actress who predominantly appears in Punjabi language films, alongside few Hindi films. In addition to few Tamil and Telugu films.[3][4] She participated in the Femina Miss India contest in 2012. Sonam Bajwa started her acting career in 2013 with the Punjabi film Best Of Luck. She played the leading female role in the 2014 film Punjab 1984.[5] She won the PTC Punjabi Film Awards for Best Actress in 2020 for Ardab Mutiyaran.[6]\n" +
            "\n" +
            "Early life and career\n" +
            "Bajwa was born on 16 August 1989 in Nainital and is a Punjabi.[2][7] She studied at Delhi University. She moved to Mumbai in 2012, she participated in the Femina Miss India contest. She became an air hostess and pursued a career in acting.[5][1]\n" +
            "\n" +
            "She debuted with the Punjabi film Best Of Luck (2013) and played the female lead in period drama Punjab 1984 (2014).[5][8] She has also appeared in Tamil romantic comedy Kappal in 2014.[9]\n" +
            "\n" +
            "She was nominated for the PTC Punjabi Film Awards for Best Actress award for Carry on Jatta 2 in 2019[10] and won it in 2020 for Ardab Mutiyaran.[6]\n" +
            "\n" +
            "Media\n" +
            "Bajwa was ranked at No. 1 in the Chandigarh Times Most Desirable Woman in 2016,[11] at No. 1 in 2017,[12] at No. 2 in 2018,[13] at No. 1 in 2019,[14] at No. 4 in 2020.","Narendra Damodardas Modi (Gujarati: [ˈnəɾendɾə dɑmodəɾˈdɑs ˈmodiː] (listen); born 17 September 1950)[b] is an Indian politician serving as the 14th and current prime minister of India since May 2014. Modi was the chief minister of Gujarat from 2001 to 2014 and is the Member of Parliament from Varanasi. He is a member of the Bharatiya Janata Party (BJP) and of the Rashtriya Swayamsevak Sangh (RSS), a right-wing Hindu nationalist paramilitary volunteer organisation. He is the longest serving prime minister from outside the Indian National Congress.\n" +
            "\n" +
            "Modi was born and raised in Vadnagar in northeastern Gujarat, where he completed his secondary education. He was introduced to the RSS at age eight. He has reminisced about helping out after school at his father's tea stall at the Vadnagar railway station. At age 18, he was married to Jashodaben Chimanlal Modi, whom he abandoned soon after. He first publicly acknowledged her as his wife more than four decades later when required to do so by Indian law, but has made no contact with her since. Modi has asserted he had travelled in northern India for two years after leaving his parental home, visiting a number of religious centres, but few details of his travels have emerged. Upon his return to Gujarat in 1971, he became a full-time worker for the RSS. After the state of emergency was declared by Prime Minister Indira Gandhi in 1975, he went into hiding. The RSS assigned him to the BJP in 1985 and he held several positions within the party hierarchy until 2001, rising to the rank of general secretary.[c]\n" +
            "\n" +
            "Modi was appointed chief minister of Gujarat in 2001 due to Keshubhai Patel's failing health and poor public image following the earthquake in Bhuj. Modi was elected to the legislative assembly soon after. His administration has been considered complicit in the 2002 Gujarat riots in which 1044 people were killed, three-quarters of whom were Muslim,[d] or otherwise criticised for its management of the crisis. A Special Investigation Team appointed by the Supreme Court of India found no evidence to initiate prosecution proceedings against him personally.[e] While his policies as chief minister—credited with encouraging economic growth—have received praise, his administration was criticised for failing to significantly improve health, poverty and education indices in the state.[f]\n" +
            "\n" +
            "Modi led the BJP in the 2014 general election which gave the party a majority in the lower house of Indian parliament, the Lok Sabha, the first time for any single party since 1984. His administration has tried to raise foreign direct investment in the Indian economy and reduced spending on healthcare, education, and social welfare programmes. He centralised power by abolishing the Planning Commission and replacing it with the NITI Aayog. He began a high-profile sanitation campaign, controversially initiated a demonetisation of high-denomination banknotes and a transformation of the taxation regime, and weakened or abolished environmental and labour laws. He oversaw the country's response to the COVID-19 pandemic. As prime minister, he has received consistently high approval ratings.[12][13][14]\n" +
            "\n" +
            "Under Modi's tenure, India has experienced democratic backsliding.[15][16][g] Following his party's victory in the 2019 general election, his administration revoked the special status of Jammu and Kashmir, introduced the Citizenship Amendment Act and three controversial farm laws, which prompted widespread protests and sit-ins across the country, resulting in a formal repeal of the latter. Described as engineering a political realignment towards right-wing politics, he remains a figure of controversy domestically and internationally over his Hindu nationalist beliefs and handling of the 2002 Gujarat riots, cited as evidence of a majoritarian and exclusionary social agenda.","Software Engineer helping you excel in Tech & Life | 95K+ Followers | International Open Source Award finalist | Educator | Google Connect Winner'19 | Scholar GHCI'20 | Winner SIH, 21U21 Award","Avul Pakir Jainulabdeen Abdul Kalam BR (/ˈɑːbdəl kəˈlɑːm/ (listen); 15 October 1931 – 27 July 2015) was an Indian aerospace scientist and statesman who served as the 11th president of India from 2002 to 2007. He was born and raised in Rameswaram, Tamil Nadu and studied physics and aerospace engineering. He spent the next four decades as a scientist and science administrator, mainly at the Defence Research and Development Organisation (DRDO) and Indian Space Research Organisation (ISRO) and was intimately involved in India's civilian space programme and military missile development efforts.[1] He thus came to be known as the Missile Man of India for his work on the development of ballistic missile and launch vehicle technology.[2][3][4] He also played a pivotal organisational, technical, and political role in India's Pokhran-II nuclear tests in 1998, the first since the original nuclear test by India in 1974.[5]\n" +
            "\n" +
            "Kalam was elected as the 11th president of India in 2002 with the support of both the ruling Bharatiya Janata Party and the then-opposition Indian National Congress. Widely referred to as the \"People's President\",[6] he returned to his civilian life of education, writing and public service after a single term. He was a recipient of several prestigious awards, including the Bharat Ratna, India's highest civilian honour.\n" +
            "\n" +
            "While delivering a lecture at the Indian Institute of Management Shillong, Kalam collapsed and died from an apparent cardiac arrest on 27 July 2015, aged 83.[7] Thousands, including national-level dignitaries, attended the funeral ceremony held in his hometown of Rameswaram, where he was buried with full state honours.")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        val prev = findViewById<ImageButton>(R.id.imgPrev)
        val next = findViewById<ImageButton>(R.id.imgNext)
        val text = findViewById<TextView>(R.id.textview)
        val text1 = findViewById<TextView>(R.id.about)

        prev.setOnClickListener{
            val idCurrentImageString = "pic$currentImage"
            //covert string id into integer address associated with it
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (6 + currentImage-1 )% 6

            val idImageToShowString = "pic$currentImage"
            //covert string id into integer address associated with it
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            text.text = names[currentImage]
            text1.text = about[currentImage]
        }

        next.setOnClickListener{
            val idCurrentImageString = "pic$currentImage"
            //covert string id into integer address associated with it
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (6 + currentImage+1 )% 6

            val idImageToShowString = "pic$currentImage"
            //covert string id into integer address associated with it
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            text.text = names[currentImage]
            text1.text = about[currentImage]
        }
    }
}