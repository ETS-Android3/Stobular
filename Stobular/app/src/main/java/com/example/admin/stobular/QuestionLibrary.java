package com.example.admin.stobular;

/**
 * Created by admin on 2/18/2018.
 */

public class QuestionLibrary {

    String[] mQuestions  = {
            "He was HAUGHTY and cruel, rapacious and given to luxury.",
            "Three of the Brazilian species are VORACIOUS and dangerous.",
            "Dupont was compelled to retreat and CAPITULATE with his forces.",
            "The division of labor applied to science will YIELD substantial results.",
            "Evil is not having to overcome moral QUALMS about murdering.",
            "Neither manifested the least DISPOSITION to retreat.",
            "The student has made EGREGIOUS errors on the examination.",
            "She has an uncanny way of sticking to PERTINENT details.",
            "Things are temporal, the ideas PERPETUAL, God eternal.",
            "With the royal SANCTION a petition was addressed to Sixtus IV.",
            "A cry is harsh and DISCORDANT, but many softer notes are employed.",
            "A physical assumption's PROPRIETY is justified solely by experience.",
            "His ZEAL and energy met everywhere with conspicuous success.",
            "He was FERVENT in spirit serving the Lord.",
            "She was CONSCIENTIOUS with regard to her duties as examiner.",
            "We complain of the unjustifiable ODIUM, casted upon us by dishonest persons.",
            "She was a VERITABLE garden of indecision.",
            "He still follows the wise MAXIM which he had adopted as a student.",
            "His frowning face was PALLID and quivered",
            "The Afghans VAUNT the salubrity and charm of some local climates.",
            "Some of the math students found the ABSTRUSE concept hard to comprehend."
    };

    private String mChoices [] [] = {
            {"Quiet", "Humble", "Arrogant", "Smart"},
            {"Ravenous", "Wild", "Docile", "Full"},
            {"Win", "Surrender", "Agree", "Pretend"},
            {"Remember", "Hoard", "Plead", "Give"},
            {"Misgivings", "Value", "Confidence", "Approval"},
            {"Bundle", "Hate", "Mismanagement", "Inclination"},
            {"Atrocious", "Concealed" , "Minor" , "Obvious"},
            {"Improper", "Admissible", "Slanted", "Conflicting"},
            {"Ceaseless", "Changing", "Brief", "Transient"},
            {"Veto", "Prevention", "Reward", "Approval"},
            {"Similar", "Cacophonous", "Arrange", "Synergy"},
            {"Decorum", "Discord", "Slavish", "Retentive"},
            {"Rankle", "Mien", "Ardor", "Apathy"},
            {"Churlish", "Enthusiastic", "Frigid", "Diligent"},
            {"Casual", "Remiss", "Meticulous", "Lackadaisical"},
            {"Fear", "Exaltation", "Regard", "Abhorrence"},
            {"Tactic", "Genuine", "Swarm", "Uncanny"},
            {"Proverb", "Restitution", "Quell", "Narrate"},
            {"Angry", "Bright", "Pale", "Malleable"},
            {"Foil", "Retort", "Hide", "Boast"},
            {"Shallow", "Superficial", "Easy", "Hard"}

    };

    private String mCorrectAnswers [] = {
            "Arrogant", "Ravenous", "Surrender","Give", "Misgivings",
            "Inclination", "Atrocious", "Admissible", "Ceaseless", "Approval",
            "Cacophonous", "Decorum", "Ardor", "Enthusiastic", "Meticulous",
            "Abhorrence", "Genuine", "Proverb", "Pale", "Boast",
            "Hard"};

    public int getLength(){
        return mQuestions.length;
    }

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a] [0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a] [1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice0 = mChoices[a] [2];
        return choice0;
    }

    public String getChoice4(int a) {
        String choice0 = mChoices[a] [3];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

