import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    df=pd.DataFrame(players)
    a,b=df.shape
    return [a,b]
    
