import Timeline from "./timeline/Timeline.tsx";
import {FaPlus} from "react-icons/fa6";

export default function MainPage() {
    return (
        <div>
            <button className='bg-violet-600 rounded-full p-1.5 hover:cursor-pointer hover:bg-violet-700 ring-2 ring-violet-950'><FaPlus className='text-stone-50 text-3xl'/></button>
            <Timeline/>
        </div>
    )
}