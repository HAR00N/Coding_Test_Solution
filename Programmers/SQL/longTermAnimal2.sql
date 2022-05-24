SELECT * 
FROM (

        SELECT
              T1.ANIMAL_ID
            , T1.NAME
            
    
        FROM ANIMAL_INS T1
        LEFT JOIN ANIMAL_OUTS T2
        ON T1.ANIMAL_ID = T2.ANIMAL_ID

        WHERE T2.DATETIME IS NOT NULL
        ORDER BY T2.DATETIME-T1.DATETIME DESC
        
    )
WHERE ROWNUM <=2;