package org.mskcc.cbio.oncokb.util;

import org.mskcc.cbio.oncokb.model.Evidence;
import org.mskcc.cbio.oncokb.model.LevelOfEvidence;

import java.util.*;

/**
 * Created by hongxinzhang on 4/5/16.
 */
public class LevelUtils {
    public static final List<LevelOfEvidence> LEVELS = Collections.unmodifiableList(
        new ArrayList<LevelOfEvidence>() {{
            add(LevelOfEvidence.LEVEL_4);
            add(LevelOfEvidence.LEVEL_3B);
            add(LevelOfEvidence.LEVEL_3A);
            add(LevelOfEvidence.LEVEL_2B);
            add(LevelOfEvidence.LEVEL_2A);
            add(LevelOfEvidence.LEVEL_R1);
            add(LevelOfEvidence.LEVEL_1);
        }}
    );

    public static LevelOfEvidence getHighestLevelFromEvidence(Set<Evidence> evidences) {
        if (evidences != null) {
            Integer highestLevelIndex = -1;

            for (Evidence evidence : evidences) {
                LevelOfEvidence level = evidence.getLevelOfEvidence();
                if (level != null) {
                    Integer _index = LEVELS.indexOf(level);
                    highestLevelIndex = _index > highestLevelIndex ? _index : highestLevelIndex;
                }
            }

            return highestLevelIndex > -1 ? LEVELS.get(highestLevelIndex) : null;

        }
        return null;
    }

    public static LevelOfEvidence getHighestLevel(Set<LevelOfEvidence> levels) {
        Integer highestLevelIndex = -1;
        for(LevelOfEvidence levelOfEvidence : levels) {
            if (levelOfEvidence != null) {
                Integer _index = LEVELS.indexOf(levelOfEvidence);
                highestLevelIndex = _index > highestLevelIndex ? _index : highestLevelIndex;
            }
        }
        return highestLevelIndex > -1 ? LEVELS.get(highestLevelIndex) : null;
    }

    public static LevelOfEvidence getHighestLevelFromEvidenceByLevels(Set<Evidence> evidences, Set<LevelOfEvidence> levels) {
        if (levels == null) {
            return getHighestLevelFromEvidence(evidences);
        }
        if (evidences != null) {
            Integer highestLevelIndex = -1;

            for (Evidence evidence : evidences) {
                LevelOfEvidence level = evidence.getLevelOfEvidence();
                if (levels.contains(level)) {
                    if (level != null) {
                        Integer _index = LEVELS.indexOf(level);
                        highestLevelIndex = _index > highestLevelIndex ? _index : highestLevelIndex;
                    }
                }
            }

            return highestLevelIndex > -1 ? LEVELS.get(highestLevelIndex) : null;

        }
        return null;
    }

    public static Set<LevelOfEvidence> getLevelsFromEvidence(Set<Evidence> evidences) {
        Set<LevelOfEvidence> levels = new HashSet<>();
        if (evidences != null) {
            for (Evidence evidence : evidences) {
                LevelOfEvidence level = evidence.getLevelOfEvidence();
                if (!levels.contains(level)) {
                    levels.add(level);
                }
            }

        }
        return levels;
    }

    public static Set<LevelOfEvidence> getLevelsFromEvidenceByLevels(Set<Evidence> evidences, Set<LevelOfEvidence> levels) {
        Set<LevelOfEvidence> result = new HashSet<>();
        if (evidences != null) {
            for (Evidence evidence : evidences) {
                LevelOfEvidence level = evidence.getLevelOfEvidence();
                if (levels.contains(level) && !result.contains(level)) {
                    result.add(level);
                }
            }

        }
        return result;
    }

    public static Set<LevelOfEvidence> getPublicLevels() {
        return new HashSet<LevelOfEvidence>() {{
            add(LevelOfEvidence.LEVEL_1);
            add(LevelOfEvidence.LEVEL_R1);
            add(LevelOfEvidence.LEVEL_2A);
            add(LevelOfEvidence.LEVEL_3A);
            add(LevelOfEvidence.LEVEL_4);
        }};
    }

    public static Set<LevelOfEvidence> getPublicAndOtherIndicationLevels() {
        return new HashSet<LevelOfEvidence>() {{
            add(LevelOfEvidence.LEVEL_1);
            add(LevelOfEvidence.LEVEL_R1);
            add(LevelOfEvidence.LEVEL_2A);
            add(LevelOfEvidence.LEVEL_2B);
            add(LevelOfEvidence.LEVEL_3A);
            add(LevelOfEvidence.LEVEL_3B);
            add(LevelOfEvidence.LEVEL_4);
        }};
    }

    public static LevelOfEvidence setToAlleleLevel(LevelOfEvidence level, Boolean sameIndication) {
        Set<LevelOfEvidence> convertLevels = new HashSet<>();
        convertLevels.add(LevelOfEvidence.LEVEL_0);
        convertLevels.add(LevelOfEvidence.LEVEL_1);
        convertLevels.add(LevelOfEvidence.LEVEL_2A);
        convertLevels.add(LevelOfEvidence.LEVEL_2B);
        convertLevels.add(LevelOfEvidence.LEVEL_3A);

        Set<LevelOfEvidence> ignoreIndication = new HashSet<>();
        ignoreIndication.add(LevelOfEvidence.LEVEL_R1);
        ignoreIndication.add(LevelOfEvidence.LEVEL_R2);
        ignoreIndication.add(LevelOfEvidence.LEVEL_R3);

        if (level == null || ignoreIndication.contains(level))
            return null;

        if (convertLevels.contains(level)) {
            if (sameIndication) {
                return LevelOfEvidence.LEVEL_3A;
            } else {
                return LevelOfEvidence.LEVEL_3B;
            }
        }

        return level;
    }

    public static Set<LevelOfEvidence> parseStringLevelOfEvidences(String levelOfEvidenceStr) {
        Set<LevelOfEvidence> levelOfEvidences = new HashSet<>();
        if (levelOfEvidenceStr != null) {
            String[] levelStrs = levelOfEvidenceStr.trim().split("\\s*,\\s*");
            for (int i = 0; i < levelStrs.length; i++) {
                LevelOfEvidence level = LevelOfEvidence.getByName(levelStrs[i]);
                if (level != null) {
                    levelOfEvidences.add(level);
                }
            }
        }
        return levelOfEvidences;
    }
}
